SUMMARY = "Conversion between documentation formats"
DESCRIPTION = "Pandoc-cli provides a command-line executable that uses the pandoc library to \
convert between markup formats."
LICENSE = "GPL-2.0-or-later"

PV = "3.10"

RPM_NAME = "pandoc-cli-3.10-1.3.aarch64.rpm"
RPM_HASH = "56a8212c57949991b49cc37fe2ebbe15df070c07ed8ddb60661cc57c661fe3b83cce027cfa2b84934df7f873374225f3e5831cb65daa62c157d485eba145526f"

RPROVIDES:${PN} += "pandoc \
pandoc-cli"

RDEPENDS:${PN} += "ghc-pandoc \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libyaml-0.so.2 \
libz.so.1"

inherit rpm
