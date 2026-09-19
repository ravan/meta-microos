SUMMARY = "Documentation for WTForms"
DESCRIPTION = "Documentation for WTForms, which is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python-WTForms-doc-3.2.1-1.5.noarch.rpm"
RPM_HASH = "ba975bf650107a150de6aa9f9d2fede4cc5776cc2b1664436e1fd3dbb3213795b2d60398ddfa5901fee4d8ed59a8dd3b484de4167fc3d356a60ae69ec507a0c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WTForms-doc"

RDEPENDS:${PN} += ""

inherit rpm
