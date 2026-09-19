SUMMARY = "Jupyter server extension integrating collaborative shared models"
DESCRIPTION = "jupyter-server extension integrating collaborative shared models. \
 \
The collaborative shared models are used for both: \
- real time collaboration, and \
- server-side execution of notebooks \
 \
This package provides the common jupyter configuration file."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "jupyter-server-ydoc-2.4.0-1.4.noarch.rpm"
RPM_HASH = "243f5145b8fb91994f4aeaaa27d03e6f5c562c278248f46de15290c25f57332b55c37c13e66bf7ae0a417c3c9659e60c0063568f24f7ad480d7783bda865ea19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-ydoc"

RDEPENDS:${PN} += "python3dist-jupyter-server-ydoc"

inherit rpm
