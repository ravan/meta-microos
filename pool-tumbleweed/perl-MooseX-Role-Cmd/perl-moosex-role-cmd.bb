SUMMARY = "Wrap system command binaries the Moose way"
DESCRIPTION = "MooseX::Role::Cmd is a Moose role intended to ease the task of building \
command-line wrapper modules. It automatically maps Moose objects into \
command strings which are passed to IPC::Cmd."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-MooseX-Role-Cmd-0.10-12.33.noarch.rpm"
RPM_HASH = "62e098f0599e9daed19565760bc3277a18b7fbb735d84a0f750344bf4a79e9eac24847bc1377a0cdd82b74d8748baff65828fd75cd6e9ac8c1e5f530d6bee498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Role--Cmd \
perl-MooseX--Role--Cmd--Meta--Attribute--Trait \
perl-MooseX-Role-Cmd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IPC--Cmd \
perl-Moose"

inherit rpm
