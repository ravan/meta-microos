SUMMARY = "A Sphinx extension for changelog manipulation"
DESCRIPTION = "Releases is a Python 2+3 compatible `Sphinx <http://sphinx-doc.org>`_ extension \
designed to help you keep a source control friendly, merge friendly changelog \
file & turn it into useful, human readable HTML output. \
 \
Specifically: \
 \
* The source format (kept in your Sphinx tree as ``changelog.rst``) is a \
  stream-like timeline that plays well with source control & only requires one \
  entry per change (even for changes that exist in multiple release lines). \
* The output (when you have the extension installed and run your Sphinx build \
  command) is a traditional looking changelog page with a section for every \
  release; multi-release issues are copied automatically into each release. \
* By default, feature and support issues are only displayed under feature \
  releases, and bugs are only displayed under bugfix releases. This can be \
  overridden on a per-issue basis."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "python313-releases-2.1.1-2.9.noarch.rpm"
RPM_HASH = "7733dc43c069de6eab86308fd6861dd2ef60ddf506075171a7c4c3ceb54cda9a5f319312bcfe1ab6cab76859d19494c5acbab627404b139b5f91ad7d8189f0e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-releases \
python3.13dist-releases \
python313-releases \
python3dist-releases"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-semantic-version"

inherit rpm
