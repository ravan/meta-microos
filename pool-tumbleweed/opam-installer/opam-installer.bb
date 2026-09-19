SUMMARY = "Standalone tool for opam install files"
DESCRIPTION = "Handles (un)installation of package files following instructions from \
OPAM *.install files."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.5.2"

RPM_NAME = "opam-installer-2.5.2-1.3.aarch64.rpm"
RPM_HASH = "4da35f2b4e85aa70000d87217cb77e9737f53ba74ebd9fa54c632416e101d1f1d121eea74bbaa52a10c2baf980f0c454f1778cfdd9ac543983e93aa65e6ee50f"

RPROVIDES:${PN} += "opam-installer"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
opam"

inherit rpm
