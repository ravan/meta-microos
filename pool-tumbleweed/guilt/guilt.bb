SUMMARY = "quilt on top of git"
DESCRIPTION = "Andrew Morton originally developed a set of scripts for maintaining \
kernel patches outside of any SCM tool. Others extended these into a \
suite called quilt. The basic idea behind quilt is to maintain patches \
instead of maintaining source files. Patches can be added, removed or \
reordered, and they can be refreshed as you fix bugs or update to a new \
base revision. quilt is very powerful, but it is not integrated with \
the underlying SCM tools. This makes it difficult to visualize your \
changes. \
 \
Guilt allows one to use quilt functionality on top of a Git repository. \
Changes are maintained as patches which are committed into Git. \
Commits can be removed or reordered, and the underlying patch can be \
refreshed based on changes made in the working directory. The patch \
directory can also be placed under revision control, so you can have a \
separate history of changes made to your patches."
LICENSE = "GPL-2.0-only"

PV = "0.36"

RPM_NAME = "guilt-0.36-1.13.noarch.rpm"
RPM_HASH = "4a1cf618f61ea5b9009f4217e3012e8996e07f9ce5a445429de995069816c733fd389b9c875d52242b7bb24b75d5d8daeced27fb56092a048cb1d19b318b5759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guilt"

RDEPENDS:${PN} += "/usr/bin/sh \
git"

inherit rpm
