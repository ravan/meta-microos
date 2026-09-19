SUMMARY = "Mono's Windows Forms implementation"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Mono's Windows Forms implementation."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-winforms-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "7e02e001492e7535485b7309fee36ee7a572c8c02e3a4a4ddf8f39746e4f7e4bfb8c32f12feb371cc0941783cf223629b778fce7e41c4bbee32c8453d852d7ed"

RPROVIDES:${PN} += "mono-Accessibility \
mono-Mono.WebBrowser \
mono-System.Design \
mono-System.Drawing \
mono-System.Drawing.Design \
mono-System.Windows.Forms \
mono-System.Windows.Forms.DataVisualization \
mono-window-forms \
mono-winforms"

RDEPENDS:${PN} += "mono-Mono.Posix \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Data \
mono-System.Drawing \
mono-System.Runtime.Serialization.Formatters.Soap \
mono-System.Web \
mono-System.Xml \
mono-core \
mono-mscorlib"

inherit rpm
