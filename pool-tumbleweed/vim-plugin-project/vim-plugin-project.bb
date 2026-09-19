SUMMARY = "Organize/Navigate projects of files"
DESCRIPTION = "You can use this plugin's basic functionality to set up a list of \
frequently-accessed files for easy navigation. The list of files will be \
displayed in a window on the left side of the vim window, and you can press \
<Return> or double-click on filenames in the list to open the files. This is \
similar to how some IDEs I've used work. I find this easier to use than having \
to navigate a directory hierarchy with the file-explorer.  It also obviates the \
need for a buffer explorer because you have your list of files on the left of \
the vim window."
LICENSE = "SUSE-Public-Domain"

PV = "1.4.1"

RPM_NAME = "vim-plugin-project-1.4.1-64.2.noarch.rpm"
RPM_HASH = "fd802bd8e6b5c95726446984ae9ea4e49a92c6d34accf049925f6b770ed5cadf06d25fa8190a1e43bebf7062e49c320e8198e92c0ee7d37a4c25b473fd7a3e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-project"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
