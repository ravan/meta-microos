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

RPM_NAME = "python314-releases-2.1.1-2.9.noarch.rpm"
RPM_HASH = "03fdaab71361167a44b78dd52d65a4e8463f4478c1887fdd9486fe5cd5a93923723e95af968af29d61965c9141a4c14cb21d55634d2a4dc6d6df93699dbebefb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-releases \
python314-releases \
python3dist-releases"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-semantic-version"

inherit rpm
