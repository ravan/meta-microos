SUMMARY = "Mono implementation of core WinFX APIs"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Mono implementation of core WinFX APIs"
LICENSE = "MIT & MS-PL"

PV = "6.12.0"

RPM_NAME = "mono-winfxcore-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "9df5e410f750b8aede7cadd9b682a2ef3845cd77ffe5066ea130891f70f924b6efde24fb5d6458f636c847a9e5b66fdfbe2c4cb55c350d2fc560422618e2f10a"

RPROVIDES:${PN} += "mono-WindowsBase \
mono-winfxcore"

RDEPENDS:${PN} += "mono-System \
mono-System.Xaml \
mono-System.Xml \
mono-core \
mono-mscorlib"

inherit rpm
