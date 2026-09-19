SUMMARY = "Additional utils for Perl symbols manipulation"
DESCRIPTION = "This module provides a set of additional functions useful for Perl symbols \
manipulation. \
 \
All Perl symbols from the same package are organized as a stash. Each \
symbol (glob) contains one or more of following slots: 'SCALAR', 'ARRAY', \
'HASH', 'CODE', 'IO', 'FORMAT'. These slots are also accessible as standard \
variables or bare words. \
 \
The Perl symbols table is directly accessible with typeglob prefix but it \
can be difficult to read and problematic if strict mode is used. Also the \
access to stash, glob and one of its slot have different syntax notation. \
 \
'stash' and 'fetch_glob' functions gets stash or glob without need to use \
'no strict 'refs''. \
 \
'delete_glob' function allows to delete specific slot of symbol name \
without deleting others. \
 \
'delete_sub' removes the symbol from class API. This symbol won't be \
available as an object method. \
 \
'export_glob' function exports a glob to the target package. \
 \
'export_package' works like the Exporter manpage module and allows to \
export symbols from one package to other. \
 \
'unexport_package' allows to delete previously exported symbols."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0203"

RPM_NAME = "perl-Symbol-Util-0.0203-5.40.noarch.rpm"
RPM_HASH = "7db0b1c0b37d2ed83de82ab7fcc4764cb307b089f7f0e217c4d11619e152cc439d274821ef151cd88a031ffb82d7ef1f7ad37ecec70807ad8e2ee6700f5a7290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Symbol--Util \
perl-Symbol-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
