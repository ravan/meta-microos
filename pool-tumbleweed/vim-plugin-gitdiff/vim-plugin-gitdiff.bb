SUMMARY = "Show git diff in a split window"
DESCRIPTION = "This script provides two functions to display git diffs in vim. \
:GITDiff [commitish] \
    Split the vim window vertically, display the HEAD, or some other changeset, version of the file in the split, then diff them. \
:GITChanges [commitish] \
    Highlight lines that were changed since the HEAD or some other changeset."
LICENSE = "GPL-2.0-only"

PV = "2"

RPM_NAME = "vim-plugin-gitdiff-2-64.2.noarch.rpm"
RPM_HASH = "d21b850b550b5cba3c49dee0b7cd812451956bbbab5475b8089f4db4c6a5eaa22a7a7f7af43aa8e0a1d0c086ef7ef73a17cb9f2aaeed6989a0f47032ca39eb4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-gitdiff"

RDEPENDS:${PN} += "git-core"

inherit rpm
