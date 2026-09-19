SUMMARY = "Documentation of liblangtag API"
DESCRIPTION = "The liblangtag-doc package contains documentation files for liblangtag."
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.6.8"

RPM_NAME = "liblangtag-doc-0.6.8-1.3.noarch.rpm"
RPM_HASH = "6de1e9f7996c635d0732f791b049ed5405427922a885dc03ed994e34213557370411084357e8b5f387be879b8c7ee877bd578d44f62df6b0811487da22c44c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liblangtag-doc"

RDEPENDS:${PN} += ""

inherit rpm
