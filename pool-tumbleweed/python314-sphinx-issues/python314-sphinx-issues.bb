SUMMARY = "A Sphinx extension for linking to a project's issue tracker"
DESCRIPTION = "A Sphinx extension for linking to a project's issue tracker. It \
includes roles for linking to issues as well as user profiles, with \
built-in support for GitHub (though this works with other services)."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python314-sphinx-issues-6.0.0-1.3.noarch.rpm"
RPM_HASH = "f1b729581c1545583bb8881a060d8efa9cf4f3a564abe19a7e04384b9e669f0c0323189a3242acba1db1b0b98b86aeea9ac059e41d29cc3d3219d44a8fd3cbeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-issues \
python314-sphinx-issues \
python3dist-sphinx-issues"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
