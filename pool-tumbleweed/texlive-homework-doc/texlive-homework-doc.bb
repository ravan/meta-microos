SUMMARY = "Documentation for texlive-homework"
DESCRIPTION = "This package includes the documentation for texlive-homework"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-homework-doc-2026.226.svn78004-60.4.noarch.rpm"
RPM_HASH = "acd6fcfdadadc1fd59988a0b5896bf7abe9507a37c933e7e2c698cfbe8e85f6e7ec905996c1449b60c291f8217f7b13a75eb3094728ecdbfdc050f0d7bbe2c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-homework-doc-zh;de;es;fr;ja \
texlive-homework-doc"

RDEPENDS:${PN} += ""

inherit rpm
