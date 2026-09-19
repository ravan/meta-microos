SUMMARY = "Store a Moose object in glob reference"
DESCRIPTION = "This module allows to store Moose object in glob reference of file handle. \
The class attributes will be stored in hash slot associated with glob \
reference. It allows to create a Moose version of the IO::Handle manpage. \
 \
The attributes can be accessed directly with following expression: \
 \
  my $hashref = \\%{*$self}; \
  print $hashref->{key}; \
 \
or shorter: \
 \
  print *$self->{key}; \
 \
but the standard accessors should be used instead: \
 \
  print $self->key;"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.0701"

RPM_NAME = "perl-MooseX-GlobRef-0.0701-9.40.noarch.rpm"
RPM_HASH = "c60f4964216b432015479dfde66f3eb2e725a281593dfebc7fc67d63b54bfd8241dea8c09d5162855c506f4d30aa21e97efadaa0aa16f38ee3e12dfec0f7645d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--GlobRef \
perl-MooseX--GlobRef--Object \
perl-MooseX--GlobRef--Role--Meta--Instance \
perl-MooseX--GlobRef--Role--Object \
perl-MooseX-GlobRef"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose"

inherit rpm
