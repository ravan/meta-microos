SUMMARY = "Database connectivity for Mono"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Database connectivity for Mono."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-data-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "983b565da2dac9d51c0850654e478af70427c404ff504882bde2c56be3dcf3bac45eef5a24aff4da503fe98a123a533d2df0ed3981423694529ef7b018de4922"

RPROVIDES:${PN} += "mono-Mono.Data.Tds \
mono-Novell.Directory.Ldap \
mono-System.Data \
mono-System.Data.DataSetExtensions \
mono-System.Data.Entity \
mono-System.Data.Linq \
mono-System.DirectoryServices \
mono-System.DirectoryServices.Protocols \
mono-System.EnterpriseServices \
mono-System.Runtime.Serialization \
mono-System.Transactions \
mono-WebMatrix.Data \
mono-data \
mono-directory \
mono-ms-enterprise \
mono-novell-directory \
mono-sqlmetal \
mono-sqlsharp"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-Mono.Security \
mono-System \
mono-System.ComponentModel.DataAnnotations \
mono-System.Configuration \
mono-System.Core \
mono-System.Numerics \
mono-System.ServiceModel.Internals \
mono-System.Xml \
mono-System.Xml.Linq \
mono-core \
mono-mscorlib"

inherit rpm
