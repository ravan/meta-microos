SUMMARY = "OCAML bindings for libhivex"
DESCRIPTION = "This subpackage contains the OCAML bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.24"

RPM_NAME = "ocaml-hivex-1.3.24-3.3.aarch64.rpm"
RPM_HASH = "c6f3c57f8b3792c9dd1ba886b631bdc845dc2abacc89a228c378c6502df94e99b7d75e3a6696fd4d12c8ea14aadf585f8a8b5326cb1c7cc87fea1ce3c7eaa701"

RPROVIDES:${PN} += "ocaml-hivex"

RDEPENDS:${PN} += ""

inherit rpm
