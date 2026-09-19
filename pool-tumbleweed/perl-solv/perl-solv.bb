SUMMARY = "Perl bindings for the libsolv library"
DESCRIPTION = "Perl bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.39"

RPM_NAME = "perl-solv-0.7.39-1.4.aarch64.rpm"
RPM_HASH = "a6458ae1cf9381f16d221138026a5cab8547756bc61f7db88a3b4a705e21f7f923b26bcf47c577460fd1ace28a7326f40c81d3113bc4c11abb659cb2477be859"

RPROVIDES:${PN} += "perl-solv \
perl-solv--Alternative \
perl-solv--Chksum \
perl-solv--Dataiterator \
perl-solv--Datamatch \
perl-solv--Datapos \
perl-solv--Decision \
perl-solv--Decisionset \
perl-solv--Dep \
perl-solv--Job \
perl-solv--Pool \
perl-solv--Pool-repo-iterator \
perl-solv--Pool-solvable-iterator \
perl-solv--Problem \
perl-solv--Repo \
perl-solv--Repo-solvable-iterator \
perl-solv--Ruleinfo \
perl-solv--Selection \
perl-solv--Solution \
perl-solv--Solutionelement \
perl-solv--SolvFp \
perl-solv--Solver \
perl-solv--Solvsig \
perl-solv--Transaction \
perl-solv--TransactionClass \
perl-solv--XRepodata \
perl-solv--XRule \
perl-solv--XSolvable \
perl-solvc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.10 \
librpmio.so.10 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1 \
perl"

inherit rpm
