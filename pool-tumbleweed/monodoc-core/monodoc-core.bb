SUMMARY = "Monodoc - Documentation tools for C# code"
DESCRIPTION = "Monodoc-core contains documentation tools for C#."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "monodoc-core-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "eab55c95819c3e2bb4f20e2e3aa4b205f4ccb347c2fb3aed202f9f9187e03f05c2e96b6596398363322389a149a9924110de0fc63581bb6f0f8e65d0e895fed0"

RPROVIDES:${PN} += "mono-mdoc \
mono-mod \
mono-monodoc \
monodoc \
monodoc-core \
monodoc-devel \
pkgconfig-monodoc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
mono-ICSharpCode.SharpZipLib \
mono-Mono.Cecil \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Xml \
mono-System.Xml.Linq \
mono-core \
mono-mscorlib \
unzip"

inherit rpm
