SUMMARY = "API wrapper around the 'tar' utility"
DESCRIPTION = "*Archive::Tar::Wrapper* is an API wrapper around the 'tar' command line \
program. It never stores anything in memory, but works on temporary \
directory structures on disk instead. It provides a mapping between the \
logical paths in the tarball and the 'real' files in the temporary \
directory on disk. \
 \
It differs from Archive::Tar in two ways: \
 \
  * *Archive::Tar::Wrapper* almost doesn't hold anything in memory (see 'write' \
method), instead using disk as storage. \
 \
  * *Archive::Tar::Wrapper* is 100% compliant with the platform's 'tar' utility \
because it uses it internally."
LICENSE = "GPL-3.0-or-later"

PV = "0.420.0"

RPM_NAME = "perl-Archive-Tar-Wrapper-0.420.0-1.10.noarch.rpm"
RPM_HASH = "984e7039e101912685af5a5ab291f7c91119458ad54a5170afaa39e859dd0abf51ee1dd9ee41b0e70ea70602c84f846d68d681c2f69f9ebd57248e0e7fcbf636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Tar--Wrapper \
perl-Archive-Tar-Wrapper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Which \
perl-IPC--Run \
perl-Log--Log4perl"

inherit rpm
