USE [SIS]
GO
/****** Object:  Table [dbo].[Log1_AssetDispose]    Script Date: 2/21/2019 9:31:45 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Log1_AssetDispose](
	[AssetID] [int] NOT NULL,
	[PN] [varchar](50) NULL,
	[SN] [varchar](50) NULL,
	[Owner] [varchar](50) NULL,
	[Sub_Category] [varchar](50) NULL,
	[Brand] [varchar](50) NULL,
	[Service_Life] [varchar](50) NULL,
	[Technician] [varchar](50) NULL,
	[Branches] [varchar](50) NULL,
	[Department] [varchar](50) NULL,
	[Category] [varchar](50) NULL,
	[Status] [varchar](50) NULL,
	[Description] [text] NULL,
	[Service_Date] [varchar](50) NULL,
 CONSTRAINT [PK_Log1_AssetDispose] PRIMARY KEY CLUSTERED 
(
	[AssetID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_Assetlist]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_Assetlist](
	[Asset_ID] [int] NOT NULL,
	[PN] [varchar](50) NULL,
	[SN] [varchar](50) NULL,
	[Branches] [varchar](50) NULL,
	[Department] [varchar](50) NULL,
	[Owner] [varchar](50) NULL,
	[Category] [varchar](50) NULL,
	[Sub_Category] [varchar](50) NULL,
	[Cost] [float] NULL,
	[Brand] [varchar](50) NULL,
	[Service_Life] [varchar](50) NULL,
	[Source] [varchar](50) NULL,
	[Service_Date] [varchar](50) NULL,
	[Description] [text] NULL,
 CONSTRAINT [PK_log1_Assetlist] PRIMARY KEY CLUSTERED 
(
	[Asset_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Log1_AssetRepair]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Log1_AssetRepair](
	[AssetID] [int] NOT NULL,
	[PN] [varchar](50) NULL,
	[SN] [varchar](50) NULL,
	[Owner] [varchar](50) NULL,
	[Sub_Category] [varchar](50) NULL,
	[Brand] [varchar](50) NULL,
	[Service_Life] [varchar](50) NULL,
	[Technician] [varchar](50) NULL,
	[Branches] [varchar](50) NULL,
	[Department] [varchar](50) NULL,
	[Category] [varchar](50) NULL,
	[Status] [varchar](50) NULL,
	[Description] [text] NULL,
	[Service_Date] [varchar](50) NULL,
 CONSTRAINT [PK_Log1_AssetRepair] PRIMARY KEY CLUSTERED 
(
	[AssetID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_Assetrequest]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_Assetrequest](
	[ReceivedID] [int] NOT NULL,
	[AssetCategory] [varchar](50) NULL,
	[SubCategory] [varchar](50) NULL,
	[RequestBy] [varchar](50) NULL,
	[Position] [varchar](50) NOT NULL,
	[Department] [varchar](50) NULL,
	[RequestDate] [varchar](50) NULL,
	[Purpose] [text] NULL,
 CONSTRAINT [PK_log1_Assetrequest] PRIMARY KEY CLUSTERED 
(
	[ReceivedID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_AssetRequests]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_AssetRequests](
	[ID] [int] NOT NULL,
	[AssetCategory] [varchar](50) NULL,
	[SubCategory] [varchar](50) NULL,
	[RequestBy] [varchar](50) NULL,
	[Position] [varchar](50) NULL,
	[Department] [varchar](50) NULL,
	[RequestDate] [varchar](50) NULL,
	[Purposed] [varchar](50) NULL,
 CONSTRAINT [PK_log1_AssetRequests] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_LoginBid]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_LoginBid](
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](50) NULL,
 CONSTRAINT [PK_log1_LoginBid] PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_LoginForm]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_LoginForm](
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](50) NULL,
 CONSTRAINT [PK_log1_LoginForm] PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_pm_requestfcontract]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_pm_requestfcontract](
	[RequestID] [int] NOT NULL,
	[Contracttype] [varchar](50) NULL,
	[ConstructionCompany] [varchar](50) NULL,
	[Cost] [float] NULL,
	[ProjectStart] [varchar](50) NULL,
	[ProjectEnd] [varchar](50) NULL,
	[Status] [varchar](50) NULL,
 CONSTRAINT [PK_log1_pm_requestfcontract] PRIMARY KEY CLUSTERED 
(
	[RequestID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_pm_requestofbudget]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_pm_requestofbudget](
	[RequestID] [int] NOT NULL,
	[Cost] [float] NULL,
	[ProjectName] [varchar](50) NULL,
	[DateNeeded] [varchar](50) NULL,
	[Purpose] [text] NULL,
	[Status] [varchar](50) NULL,
 CONSTRAINT [PK_log1_pm_requestofbudget] PRIMARY KEY CLUSTERED 
(
	[RequestID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_pm_requestofcontractor]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_pm_requestofcontractor](
	[RequestID] [int] NOT NULL,
	[TypeofContractor] [varchar](50) NULL,
	[DateNeeded] [varchar](50) NULL,
	[Purpose] [text] NULL,
	[Status] [varchar](50) NULL,
 CONSTRAINT [PK_log1_pm_requestofcontractor] PRIMARY KEY CLUSTERED 
(
	[RequestID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_procure_AwardingList]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_procure_AwardingList](
	[AwardNo] [int] NOT NULL,
	[BidderID] [int] NULL,
	[BidderName] [varchar](50) NULL,
	[ContactNo] [varchar](50) NULL,
	[ItemName] [varchar](50) NULL,
	[Quantity] [varchar](50) NULL,
	[Price] [float] NULL,
	[Description] [text] NULL,
 CONSTRAINT [PK_log1_procure_AwardingList] PRIMARY KEY CLUSTERED 
(
	[AwardNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_procure_Deliverdetail]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_procure_Deliverdetail](
	[ID] [varchar](50) NOT NULL,
	[ItemDescription] [varchar](50) NULL,
	[Quantity] [varchar](50) NULL,
	[PDO] [varchar](50) NULL,
	[PDR] [varchar](50) NULL,
	[OrderReleased] [varchar](50) NULL,
 CONSTRAINT [PK_log1_procure_Deliverdetail] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_procure_ListofSupplier]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_procure_ListofSupplier](
	[Supplier_ID] [int] IDENTITY(1,1) NOT NULL,
	[Bidder_Name] [varchar](50) NULL,
	[Contact_No] [varchar](50) NULL,
	[Price] [float] NULL,
	[Type_of_Product] [varchar](50) NULL,
	[Account_Num] [varchar](50) NULL,
	[Status] [varchar](50) NULL,
	[Product_Category] [varchar](50) NULL,
	[Account_Description] [varchar](50) NULL,
	[Date] [varchar](50) NULL,
	[Department] [varchar](50) NULL,
	[Branches] [varchar](50) NULL,
	[Quantity] [varchar](50) NULL,
	[Item_Description] [varchar](50) NULL,
	[Total] [float] NULL,
 CONSTRAINT [PK_log1_procure_ListofSupplier] PRIMARY KEY CLUSTERED 
(
	[Supplier_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_procure_purchaseOrder]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_procure_purchaseOrder](
	[RequestID] [int] NOT NULL,
	[Date] [varchar](50) NULL,
	[Quantity] [varchar](50) NULL,
	[Item_Description] [varchar](50) NULL,
	[Purposed] [text] NULL,
	[Department] [varchar](50) NULL,
	[Branches] [varchar](50) NULL,
	[ApprovedBy] [varchar](50) NULL,
	[RequestedBy] [varchar](50) NULL,
	[ReleasedBy] [varchar](50) NULL,
	[SignReceived] [varchar](50) NULL,
 CONSTRAINT [PK_log1_procure_purchaseOrder] PRIMARY KEY CLUSTERED 
(
	[RequestID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_procure_RequestBudget]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_procure_RequestBudget](
	[RequestNo] [int] NOT NULL,
	[BudgetDescription] [varchar](50) NULL,
	[department] [varchar](50) NULL,
	[date_requested] [varchar](50) NULL,
	[status] [varchar](50) NULL,
	[document_file] [image] NULL,
	[Path] [image] NULL,
 CONSTRAINT [PK_log1_procure_RequestBudget] PRIMARY KEY CLUSTERED 
(
	[RequestNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_procure_requestvendor]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_procure_requestvendor](
	[BidderID] [int] NOT NULL,
	[BidderName] [varchar](50) NULL,
	[ContactNo] [varchar](50) NULL,
	[ItemName] [varchar](50) NULL,
	[Quantity] [varchar](50) NULL,
	[BidAmount] [float] NULL,
	[Price] [float] NULL,
	[ItemDescription] [text] NULL,
 CONSTRAINT [PK_log1_procure_requestvendor] PRIMARY KEY CLUSTERED 
(
	[BidderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_Project]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_Project](
	[ProjectID] [int] NOT NULL,
	[ProjectName] [varchar](50) NULL,
	[Priority] [varchar](50) NULL,
	[StartDate] [varchar](50) NULL,
	[EndDate] [varchar](50) NULL,
	[ProjectDescription] [text] NULL,
	[Status] [varchar](50) NULL,
 CONSTRAINT [PK_log1_Project] PRIMARY KEY CLUSTERED 
(
	[ProjectID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_ProjectRisk]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_ProjectRisk](
	[ProjectID] [int] NOT NULL,
	[ProjectName] [varchar](50) NULL,
	[Priority] [varchar](50) NULL,
	[TypeOfRisk] [varchar](50) NULL,
	[Probability] [varchar](50) NULL,
	[Impact] [varchar](50) NULL,
	[Date] [varchar](50) NULL,
	[Response] [varchar](50) NULL,
 CONSTRAINT [PK_log1_ProjectRisk] PRIMARY KEY CLUSTERED 
(
	[ProjectID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_Requestmaterials]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_Requestmaterials](
	[RequestID] [int] NULL,
	[Category] [varchar](50) NULL,
	[SubCategory] [varchar](50) NULL,
	[Quantity] [varchar](50) NULL,
	[DateNeeded] [varchar](50) NULL,
	[Purpose] [varchar](50) NULL,
	[Status] [varchar](50) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_RequestPM]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_RequestPM](
	[RequestID] [int] NOT NULL,
	[Category] [varchar](50) NULL,
	[SubCategory] [varchar](50) NULL,
	[Quantity] [varchar](50) NULL,
	[DateNeeded] [varchar](50) NULL,
	[Purpose] [varchar](50) NULL,
	[Status] [varchar](50) NULL,
 CONSTRAINT [PK_log1_RequestPM] PRIMARY KEY CLUSTERED 
(
	[RequestID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_ware_addstock]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_ware_addstock](
	[Stock_ID] [varchar](50) NOT NULL,
	[Branches] [varchar](50) NULL,
	[Category] [varchar](50) NULL,
	[Sub_Category] [varchar](50) NULL,
	[Cost] [float] NULL,
	[Brand] [varchar](50) NULL,
	[Service_Life] [varchar](50) NULL,
	[Source] [varchar](50) NULL,
	[Service_Date] [varchar](50) NULL,
	[Stock] [varchar](50) NULL,
	[Description] [text] NULL,
	[Purposed] [text] NULL,
 CONSTRAINT [PK_log1_ware_addstock] PRIMARY KEY CLUSTERED 
(
	[Stock_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[log1_ware_Requestform]    Script Date: 2/21/2019 9:31:46 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[log1_ware_Requestform](
	[ReceivedID] [int] NOT NULL,
	[AssetCategory] [varchar](50) NULL,
	[SubCategory] [varchar](50) NULL,
	[RequestBy] [varchar](50) NULL,
	[Position] [varchar](50) NULL,
	[Department] [varchar](50) NULL,
	[RequestDate] [varchar](50) NULL,
	[Purpose] [text] NULL,
	[Status] [varchar](50) NULL,
 CONSTRAINT [PK_log1_ware_Requestform] PRIMARY KEY CLUSTERED 
(
	[ReceivedID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
