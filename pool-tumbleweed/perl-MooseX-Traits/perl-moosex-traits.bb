SUMMARY = "Automatically apply roles at object creation time"
DESCRIPTION = "Often you want to create components that can be added to a class \
arbitrarily. This module makes it easy for the end user to use these \
components. Instead of requiring the user to create a named class with the \
desired roles applied, or apply roles to the instance one-by-one, he can \
just create a new class from yours with 'with_traits', and then instantiate \
that. \
 \
There is also 'new_with_traits', which exists for compatibility reasons. It \
accepts a 'traits' parameter, creates a new class with those traits, and \
then instantiates it. \
 \
   Class->new_with_traits( traits => [qw/Foo Bar/], foo => 42, bar => 1 ) \
 \
returns exactly the same object as \
 \
   Class->with_traits(qw/Foo Bar/)->new( foo => 42, bar => 1 ) \
 \
would. But you can also store the result of 'with_traits', and call other \
methods: \
 \
   my $c = Class->with_traits(qw/Foo Bar/); \
   $c->new( foo => 42 ); \
   $c->whatever( foo => 1234 ); \
 \
And so on."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.13"

RPM_NAME = "perl-MooseX-Traits-0.13-1.39.noarch.rpm"
RPM_HASH = "8afd2ecd375da62a842d638c1a59a4f5e41eb32c658886537aaee9d4d1e3ba223c9573fc87683760696369031594c644df01d05ac3dc5789b2a25b31bc6ed180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Traits \
perl-MooseX--Traits--Util \
perl-MooseX-Traits"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Load \
perl-Moose--Role \
perl-Sub--Exporter \
perl-namespace--autoclean"

inherit rpm
