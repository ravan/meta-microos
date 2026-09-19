SUMMARY = "Random access reads of sequential file or scalar"
DESCRIPTION = "Allows random access to sequential file by buffering the file if \
necessary. Also allows access to data in memory to be accessed as \
if it were a file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "13.59"

RPM_NAME = "perl-File-RandomAccess-13.59-1.3.noarch.rpm"
RPM_HASH = "b7d877317787fc1e2344a4e73ea9755002e8ed5a1b7cfc362fa7829c68ed731f247b5f7aed463052d61051cd2b5c0acf048f8fd3a301c515de1289a4b63b82a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--RandomAccess \
perl-File-RandomAccess"

RDEPENDS:${PN} += ""

inherit rpm
