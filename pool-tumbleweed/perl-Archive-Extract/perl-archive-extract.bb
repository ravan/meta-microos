SUMMARY = "Generic archive extracting mechanism"
DESCRIPTION = "Archive::Extract is a generic archive extraction mechanism. \
 \
It allows you to extract any archive file of the type .tar, .tar.gz, .gz, \
.Z, tar.bz2, .tbz, .bz2, .zip, .xz,, .txz, .tar.xz or .lzma without having \
to worry how it does so, or use different interfaces for each type by using \
either perl modules, or commandline tools on your system. \
 \
See the 'HOW IT WORKS' section further down for details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.900.0"

RPM_NAME = "perl-Archive-Extract-0.900.0-1.1.noarch.rpm"
RPM_HASH = "f060c0d84cdc2f419a453da09369836bd63e421ec3b335638ebe0cfe941cdfb4ca980590bea06a27a0002afe0634f54bdf93c50420c587319af11cac9093afe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Extract \
perl-Archive-Extract"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IPC--Cmd \
perl-Locale--Maketext--Simple \
perl-Module--Load--Conditional \
perl-Params--Check"

inherit rpm
