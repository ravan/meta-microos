SUMMARY = "Python library for creating and manipulating HTML documents"
DESCRIPTION = "Dominate is a Python library for creating and manipulating HTML \
documents using an elegant DOM API. \
 \
It allows you to write HTML pages in pure Python very concisely, \
which eliminates the need to learn another template language, and \
lets you take advantage of the more powerful features of Python."
LICENSE = "GPL-3.0-only"

PV = "2.9.1"

RPM_NAME = "python313-dominate-2.9.1-2.9.noarch.rpm"
RPM_HASH = "593e48ddecdb1de250ef53d888d1c9da6a4ec4e726c66029de502f056e99429ee2ebacee0131ca69f02a249a2ae9b2dd97272fd77974ebac70b859df1b006006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dominate \
python3.13dist-dominate \
python313-dominate \
python3dist-dominate"

RDEPENDS:${PN} += "python-abi"

inherit rpm
