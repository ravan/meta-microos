SUMMARY = "Development files for dictd"
DESCRIPTION = "This package contains two programs. dict gives access to \
electronic dictionaries on the Internet. With dictd, one can \
set up a custom dictionary. To look up, for example, the word 'grunt', \
execute `dict grunt` at a command line. See the man pages of dict and \
dictd for details. \
 \
This package contains development files for the dictd package."
LICENSE = "BSD-3-Clause & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-or-later & MIT & SUSE-Public-Domain"

PV = "1.13.3+git.1731775346.2b21553"

RPM_NAME = "dictd-devel-1.13.3+git.1731775346.2b21553-2.6.noarch.rpm"
RPM_HASH = "ea5aef828c77ab473be3d48f9bab1127cd27b6950fc7ae471aa5587404e0490b207678b1b5eff53e3bc23877bae8ef3a6fe62ce988eda7ce8a98cbdfff1d3262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dictd-devel"

RDEPENDS:${PN} += "dictd"

inherit rpm
