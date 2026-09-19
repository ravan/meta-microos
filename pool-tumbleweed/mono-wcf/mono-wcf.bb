SUMMARY = "Mono implementation of WCF, Windows Communication Foundation"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Mono implementation of WCF, Windows Communication Foundation"
LICENSE = "MIT & MS-PL"

PV = "6.12.0"

RPM_NAME = "mono-wcf-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "04e1b2783c3342ca90e7d07cc49ba7357edf520d3493a7876f07ae11b6a4895da7b59368ad7ddc284838ecc569383512a208052d41b48c7eb2becce2c76232be"

RPROVIDES:${PN} += "mono-SMDiagnostics \
mono-System.Data.Services \
mono-System.Data.Services.Client \
mono-System.IdentityModel \
mono-System.IdentityModel.Selectors \
mono-System.Runtime.DurableInstancing \
mono-System.ServiceModel \
mono-System.ServiceModel.Activation \
mono-System.ServiceModel.Discovery \
mono-System.ServiceModel.Duplex \
mono-System.ServiceModel.Http \
mono-System.ServiceModel.Internals \
mono-System.ServiceModel.NetTcp \
mono-System.ServiceModel.Primitives \
mono-System.ServiceModel.Routing \
mono-System.ServiceModel.Security \
mono-System.ServiceModel.Web \
mono-core-/usr/lib/mono/4.5/Facades/System.ServiceModel.Http.dll \
mono-svcutil \
mono-wcf \
mono-winfxcore-/usr/lib/mono/4.5/System.Data.Services.Client.dll \
pkgconfig-wcf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
mono-Mono.Security \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Messaging \
mono-System.Runtime.Serialization \
mono-System.Security \
mono-System.Transactions \
mono-System.Web \
mono-System.Web.ApplicationServices \
mono-System.Web.Extensions \
mono-System.Web.Services \
mono-System.Xml \
mono-System.Xml.Linq \
mono-core \
mono-mscorlib"

inherit rpm
