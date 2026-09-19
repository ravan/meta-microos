SUMMARY = "Documentation for EMACS Gnuplot mode"
DESCRIPTION = "This package contains the Gnuplot mode documentation in PDF format."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "emacs-gnuplot-mode-doc-0.8.0-1.7.noarch.rpm"
RPM_HASH = "9d0b70e4751e63e2ebd508f1d85b4fd6f0c33996748a1acf8a30af3e6903a0c571ef988c02ce4c6e7a84632b0eeae9cd160df2586d9c10143c9e6e0fdcd49254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-gnuplot-mode-doc"

RDEPENDS:${PN} += ""

inherit rpm
