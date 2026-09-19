SUMMARY = "Edit file without entering the whole path"
DESCRIPTION = "This script uses slocate (or a similar application) to allow the user to open a \
file without having to enter a path. If multiple files are found the user is \
given the choice of which file to open. \
 \
Usage: \
  :LocateEdit somefile.txt \
  :LocateSplit somefile.txt \
  :LocateSource somefile.vim \
  :LocateRead somefile.txt"
LICENSE = "Vim"

PV = "1.3"

RPM_NAME = "vim-plugin-locateopen-1.3-64.2.noarch.rpm"
RPM_HASH = "ac8b0413f6962c0456b6a82163d830e76fe2a7615940c7075c647975e7cdb7fe99f479e58e826904c1d0d38a961c3bff61516fc99b2c0cfc73715b27734da8fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-locateopen"

RDEPENDS:${PN} += "findutils-locate \
vim"

inherit rpm
