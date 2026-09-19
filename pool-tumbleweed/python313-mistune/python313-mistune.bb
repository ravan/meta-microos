SUMMARY = "Python Markdown parser with renderers and plugins"
DESCRIPTION = "A Python Markdown parser with renderers and plugins, \
compatible with sane CommonMark rules."
LICENSE = "BSD-3-Clause"

PV = "3.3.4"

RPM_NAME = "python313-mistune-3.3.4-1.1.noarch.rpm"
RPM_HASH = "bb67080782a6e5b42fa59bb2e6561dd533126123ddad730fd3dd1d9f041506ca9df511d8051f1799f5aa8788c88c6683e3800d3746b7b32433c26e733ff77449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mistune \
python3.13dist-mistune \
python313-mistune \
python3dist-mistune"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi"

inherit rpm
