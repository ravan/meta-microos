SUMMARY = "Python module to render docstrings as HTML"
DESCRIPTION = "The docrepr package renders Python docstrings as HTML. It is based on \
the sphinxify module developed by Tim Dumol for the Sage Notebook and \
the utils.inspector module developed for the Spyder IDE."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python313-docrepr-0.2.0-2.5.noarch.rpm"
RPM_HASH = "c876137928adfa3864dcc12c94f7a2bf7116c126cdf69c3bc33eb080ea3497028a602b4922602378b5b5dedfd26431e966dc057c92a0bde63a9fea6764519fd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docrepr \
python3.13dist-docrepr \
python313-docrepr \
python3dist-docrepr"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-Sphinx \
python313-docutils"

inherit rpm
