SUMMARY = "Perl module dependency manager (aka Bundler for Perl)"
DESCRIPTION = "carton is a command line tool to track the Perl module dependencies for \
your Perl application. Dependencies are declared using cpanfile format, and \
the managed dependencies are tracked in a _cpanfile.snapshot_ file, which \
is meant to be version controlled, and the snapshot file allows other \
developers of your application will have the exact same versions of the \
modules. \
 \
For 'cpanfile' syntax, see cpanfile documentation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0.35"

RPM_NAME = "perl-Carton-1.0.35-2.7.noarch.rpm"
RPM_HASH = "4c676901dd3491c4ea8cc98d07023c810a6ef30cb9f697e21d3cb5695e7726ff1df757bc20db33cf3963c548a723088314c5ba048f52780f72c015a8ecf74515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Carton \
perl-Carton--Builder \
perl-Carton--CLI \
perl-Carton--CPANfile \
perl-Carton--Dependency \
perl-Carton--Dist \
perl-Carton--Dist--Core \
perl-Carton--Environment \
perl-Carton--Error \
perl-Carton--Error--CPANfileNotFound \
perl-Carton--Error--CommandExit \
perl-Carton--Error--CommandNotFound \
perl-Carton--Error--SnapshotNotFound \
perl-Carton--Error--SnapshotParseError \
perl-Carton--Index \
perl-Carton--Mirror \
perl-Carton--Package \
perl-Carton--Packer \
perl-Carton--Snapshot \
perl-Carton--Snapshot--Emitter \
perl-Carton--Snapshot--Parser \
perl-Carton--Tree \
perl-Carton--Util"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Meta \
perl-CPAN--Meta--Requirements \
perl-Class--Tiny \
perl-Getopt--Long \
perl-JSON--PP \
perl-Menlo--CLI--Compat \
perl-Module--CPANfile \
perl-Module--CoreList \
perl-Path--Tiny \
perl-Try--Tiny \
perl-parent"

inherit rpm
