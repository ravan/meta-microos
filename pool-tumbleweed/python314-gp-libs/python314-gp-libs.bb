SUMMARY = "Internal utilities for projects following git-pull python package spec"
DESCRIPTION = "Incubating / dogfooding some sphinx extensions and pytest plugins on git-pull \
projects, e.g. cihai, vcs-python, or tmux-python."
LICENSE = "MIT"

PV = "0.0.19"

RPM_NAME = "python314-gp-libs-0.0.19-1.1.noarch.rpm"
RPM_HASH = "011a88f27928dd631e7d5a8ddbc2e09b32569a63fc8fe0b4c6b339cf2819b82e161b960704ea3dd4c0dfea40637802e83e0fbdab2f7634004edaa6aa2fb31438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gp-libs \
python314-gp-libs \
python3dist-gp-libs"

RDEPENDS:${PN} += "python-abi \
python314-docutils \
python314-myst-parser"

inherit rpm
