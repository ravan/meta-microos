SUMMARY = "Multivalue-property package-oriented configuration"
DESCRIPTION = "MVP is a mechanism for loading configuration (or other information) for \
libraries. It doesn't read a file or a database. It's a helper for things \
that do. \
 \
The idea is that you end up with a Config::MVP::Sequence object, and that \
you can use that object to fully configure your library or application. The \
sequence will contain a bunch of Config::MVP::Section objects, each of \
which is meant to provide configuration for a part of your program. Most of \
these sections will be directly related to a Perl library that you'll use \
as a plugin or helper. Each section will have a name, and every name in the \
sequence will be unique. \
 \
This is a pretty abstract set of behaviors, so we'll provide some more \
concrete examples that should help explain how things work."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.200013"

RPM_NAME = "perl-Config-MVP-2.200013-1.18.noarch.rpm"
RPM_HASH = "6da8382a421ce2adde973761759bf9a6e1ac7867d125c1c9442226d03e9cb7ac50f2e69bbdcb1880ce0f1e7305a61533eaf2f34b0e6d15351f85b2183ee33e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--MVP \
perl-Config--MVP--Assembler \
perl-Config--MVP--Assembler--WithBundles \
perl-Config--MVP--Error \
perl-Config--MVP--Reader \
perl-Config--MVP--Reader--Findable \
perl-Config--MVP--Reader--Findable--ByExtension \
perl-Config--MVP--Reader--Finder \
perl-Config--MVP--Reader--Hash \
perl-Config--MVP--Section \
perl-Config--MVP--Sequence \
perl-Config-MVP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Load \
perl-Module--Pluggable--Object \
perl-Moose \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints \
perl-MooseX--OneArgNew \
perl-Params--Util \
perl-Role--HasMessage \
perl-Role--Identifiable--HasIdent \
perl-StackTrace--Auto \
perl-Test--More \
perl-Throwable \
perl-Tie--IxHash \
perl-Try--Tiny"

inherit rpm
