SUMMARY = "Provide https support for LWP::UserAgent"
DESCRIPTION = "The LWP::Protocol::https module provides support for using https schemed \
URLs with LWP. This module is a plug-in to the LWP protocol handling, so \
you don't use it directly. Once the module is installed LWP is able to \
access sites using HTTP over SSL/TLS. \
 \
If hostname verification is requested by LWP::UserAgent's 'ssl_opts', and \
neither 'SSL_ca_file' nor 'SSL_ca_path' is set, then 'SSL_ca_file' is \
implied to be the one provided by Mozilla::CA. If the Mozilla::CA module \
isn't available SSL requests will fail. Either install this module, set up \
an alternative 'SSL_ca_file' or disable hostname verification. \
 \
This module used to be bundled with the libwww-perl, but it was unbundled \
in v6.02 in order to be able to declare its dependencies properly for the \
CPAN tool-chain. Applications that need https support can just declare \
their dependency on LWP::Protocol::https and will no longer need to know \
what underlying modules to install."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.170.0"

RPM_NAME = "perl-LWP-Protocol-https-6.170.0-1.1.noarch.rpm"
RPM_HASH = "011dea426ab15da2d5f57984270e56414bd80932a755b7ccf9d042944f2ff404c8b0d2ce0db5254b457f362afcbc9195d07585e2622added93a9ddbfc16665ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LWP--Protocol--https \
perl-LWP-Protocol-https"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--Socket--SSL \
perl-LWP--Protocol--http \
perl-LWP--UserAgent \
perl-Net--HTTPS"

inherit rpm
