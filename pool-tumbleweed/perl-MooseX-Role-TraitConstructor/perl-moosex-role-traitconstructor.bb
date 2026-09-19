SUMMARY = "A wrapper for C<new> that can accept a"
DESCRIPTION = "This role allows you to easily accept a 'traits' argument (or another name) \
into your constructor, which will easily mix roles into an anonymous class \
before construction, much like the Moose::Meta::Attribute manpage does."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-MooseX-Role-TraitConstructor-0.01-9.41.noarch.rpm"
RPM_HASH = "c32db1fd1bb0f697e76a972b7b1013fe210d9f7e8b6a941fa7314222130f60d1ab82163c2610da3170df8c2d3f4fc2c9b1c8ba527a186ebe71904c35d3785a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Role--TraitConstructor \
perl-MooseX-Role-TraitConstructor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-Test--Exception \
perl-Test--use--ok"

inherit rpm
