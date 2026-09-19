SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python313-nbdime-git-4.0.2-18.2.noarch.rpm"
RPM_HASH = "a61bbd1fe2264ad28d3420f9b2e934c865c10360472e4862bebdc043904d03ead88cb489756901dd82647f2b57ed48f072e298b63f77a4f048ef28c8adc063f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python313-jupyter-nbdime-git \
python313-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
git-core \
python313-nbdime"

inherit rpm
