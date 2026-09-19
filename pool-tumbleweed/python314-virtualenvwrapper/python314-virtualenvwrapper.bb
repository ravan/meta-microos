SUMMARY = "Enhancements to virtualenv"
DESCRIPTION = "virtualenvwrapper is a set of extensions to Ian Bicking's virtualenv \
tool.  The extensions include wrappers for creating and deleting virtual \
environments and otherwise managing your development workflow, making it \
easier to work on more than one project at a time without introducing \
conflicts in their dependencies. \
 \
1.  Organizes all of your virtual environments in one place. \
2.  Wrappers for creating, copying and deleting environments, including \
    user-configurable hooks. \
3.  Use a single command to switch between environments. \
4.  Tab completion for commands that take a virtual environment as \
    argument. \
5.  User-configurable hooks for all operations. \
6.  Plugin system for more creating sharable extensions."
LICENSE = "MIT"

PV = "6.1.1"

RPM_NAME = "python314-virtualenvwrapper-6.1.1-2.9.noarch.rpm"
RPM_HASH = "bfb318ed8e16a13d1fb71d7f6655c0d85a8081eeb67c44ab03b989ed583a1e1c77e0724b0976df6a0da45f3acc65b6d3a17c951824b11644a1b4edfc9d241a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-virtualenvwrapper \
python314-virtualenvwrapper \
python3dist-virtualenvwrapper"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python314-stevedore \
python314-virtualenv \
python314-virtualenv-clone \
update-alternatives"

inherit rpm
