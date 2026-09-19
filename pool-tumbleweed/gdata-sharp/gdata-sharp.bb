SUMMARY = "Google Data APIs (GData) for Mono/.NET"
DESCRIPTION = "The GData .NET Client Library provides a library and source code \
that make it easy to access data through Google Data APIs."
LICENSE = "Apache-2.0"

PV = "1.4.0.2"

RPM_NAME = "gdata-sharp-1.4.0.2-27.6.noarch.rpm"
RPM_HASH = "1b77ba44fe25b34f08108ee7c6be06c761c803497f3c97f29c90c5ae9c1f84253b2833a36296e60cfdadc8d99af3d63d5971636904c0342e3b7922bdc8cb07f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdata-sharp \
google-gdata \
mono-Google.GData.AccessControl \
mono-Google.GData.Apps \
mono-Google.GData.Blogger \
mono-Google.GData.Calendar \
mono-Google.GData.Client \
mono-Google.GData.CodeSearch \
mono-Google.GData.Contacts \
mono-Google.GData.Documents \
mono-Google.GData.Extensions \
mono-Google.GData.GoogleBase \
mono-Google.GData.Health \
mono-Google.GData.Photos \
mono-Google.GData.Spreadsheets \
mono-Google.GData.YouTube"

RDEPENDS:${PN} += "mono-System \
mono-System.Web \
mono-System.Xml \
mono-mscorlib"

inherit rpm
