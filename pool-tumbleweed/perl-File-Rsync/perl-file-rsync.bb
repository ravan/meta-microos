SUMMARY = "Perl Module Interface to Rsync(1) F<Http://Rsync.Samba.Org/Rsync/>"
DESCRIPTION = "Perl Convenience wrapper for the rsync(1) program. Written for \
_rsync-2.3.2_ and updated for _rsync-3.1.1_ but should perform properly \
with most recent versions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.49"

RPM_NAME = "perl-File-Rsync-0.49-1.40.noarch.rpm"
RPM_HASH = "ab889ea06a505a4998ba65014e6dacfd7081e7683f6583204b7a8245b46d0b6adebd79710ae434029202d17bc187b0d4c64b58b5c17fc83888968e8b17a071a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Rsync \
perl-File-Rsync"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IPC--Run3 \
rsync"

inherit rpm
