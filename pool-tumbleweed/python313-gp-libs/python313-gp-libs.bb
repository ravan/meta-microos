SUMMARY = "Internal utilities for projects following git-pull python package spec"
DESCRIPTION = "Incubating / dogfooding some sphinx extensions and pytest plugins on git-pull \
projects, e.g. cihai, vcs-python, or tmux-python."
LICENSE = "MIT"

PV = "0.0.19"

RPM_NAME = "python313-gp-libs-0.0.19-1.1.noarch.rpm"
RPM_HASH = "c89f68079cbbf2c95ffc2518efea2d51bba6dfad69946966f2f9fef22c9ac2ca56533e3ad759aa120d4e619e433a29783172bba6678a9b76c53f92958b2e6d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gp-libs \
python3.13dist-gp-libs \
python313-gp-libs \
python3dist-gp-libs"

RDEPENDS:${PN} += "python-abi \
python313-docutils \
python313-myst-parser"

inherit rpm
