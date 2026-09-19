SUMMARY = "Extra locale information"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Extra locale information."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-locale-extras-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "1fdc5bcca4a62871a64faa34f98041b8f36d8aea1b37a457d6f94af8a0ed9c25721d2a198888124d3d5f1aeded73b51fab331ee05a8e54dd370bc9d3b3ea5f60"

RPROVIDES:${PN} += "mono-I18N.CJK \
mono-I18N.MidEast \
mono-I18N.Other \
mono-I18N.Rare \
mono-locale-extras"

RDEPENDS:${PN} += "mono-I18N \
mono-core \
mono-mscorlib"

inherit rpm
