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

RPM_NAME = "python313-virtualenvwrapper-6.1.1-2.9.noarch.rpm"
RPM_HASH = "d03ec459eba85095da03b8cb8048d9cd4fd8a6f3173c7aa5f4d57310a8cf17ff998a875c2f93be92ee3671fbf50975749996a210e562cd1a78e96209e1a8ee1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtualenvwrapper \
python3.13dist-virtualenvwrapper \
python313-virtualenvwrapper \
python3dist-virtualenvwrapper"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python313-stevedore \
python313-virtualenv \
python313-virtualenv-clone \
update-alternatives"

inherit rpm
