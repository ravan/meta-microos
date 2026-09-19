SUMMARY = "Documentation for texlive-arsenal-math"
DESCRIPTION = "This package includes the documentation for texlive-arsenal-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.9.3svn77682"

RPM_NAME = "texlive-arsenal-math-doc-2026.226.0.0.9.3svn77682-60.2.noarch.rpm"
RPM_HASH = "46ad8628945fe7e16240614543000a7fab4e9c533e9911c12e6226180f29a1fa4b42e4dfe6f3f8e5a0d06ef783b9e4572f9d25b8acb918304edab64ca7ea14a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arsenal-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
