SUMMARY = "Mercurial integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides mercurial integration."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "python310-nbdime-hg-4.0.2-17.1.noarch.rpm"
RPM_HASH = "2b966e6c5f5f9f9b2211f8164ffb5afc2e0acd3866be2679898cedf361fea9cc403cb9e976fa8b337845d017eb6801969abd44515b0a26900eee41fbe69a4e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-nbdime-hg \
python310-nbdime-hg"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
mercurial \
python310-nbdime"

inherit rpm
