SUMMARY = "(DEPRECATED) Wrapper Class for the various JSON classes"
DESCRIPTION = "This module tries to provide a coherent API to bring together the various \
JSON modules currently on CPAN. This module will allow you to code to any \
JSON API and have it work regardless of which JSON module is actually \
installed. \
 \
    use JSON::Any; \
 \
    my $j = JSON::Any->new; \
 \
    $json = $j->objToJson({foo=>'bar', baz=>'quux'}); \
    $obj = $j->jsonToObj($json); \
 \
or \
 \
    $json = $j->encode({foo=>'bar', baz=>'quux'}); \
    $obj = $j->decode($json); \
 \
or \
 \
    $json = $j->Dump({foo=>'bar', baz=>'quux'}); \
    $obj = $j->Load($json); \
 \
or \
 \
    $json = $j->to_json({foo=>'bar', baz=>'quux'}); \
    $obj = $j->from_json($json); \
 \
or without creating an object: \
 \
    $json = JSON::Any->objToJson({foo=>'bar', baz=>'quux'}); \
    $obj = JSON::Any->jsonToObj($json); \
 \
On load, JSON::Any will find a valid JSON module in your @INC by looking \
for them in this order: \
 \
    Cpanel::JSON::XS \
    JSON::XS \
    JSON::PP \
    JSON \
    JSON::DWIW \
 \
And loading the first one it finds. \
 \
You may change the order by specifying it on the 'use JSON::Any' line: \
 \
    use JSON::Any qw(DWIW XS CPANEL JSON PP); \
 \
Specifying an order that is missing modules will prevent those module from \
being used: \
 \
    use JSON::Any qw(CPANEL PP); # same as JSON::MaybeXS \
 \
This will check in that order, and will never attempt to load JSON::XS, \
JSON.pm/JSON, or JSON::DWIW. This can also be set via the \
'$ENV{JSON_ANY_ORDER}' environment variable. \
 \
JSON::Syck has been deprecated by its author, but in the attempt to still \
stay relevant as a 'Compatibility Layer' JSON::Any still supports it. This \
support however has been made optional starting with JSON::Any 1.19. In \
deference to a bug request starting with JSON.pm 1.20, JSON::Syck and other \
deprecated modules will still be installed, but only as a last resort and \
will now include a warning. \
 \
    use JSON::Any qw(Syck XS JSON); \
 \
or \
 \
    $ENV{JSON_ANY_ORDER} = 'Syck XS JSON'; \
 \
At install time, JSON::Any will attempt to install JSON::PP as a reasonable \
fallback if you do not appear have *any* backends installed on your system. \
 \
WARNING: If you call JSON::Any with an empty list \
 \
    use JSON::Any (); \
 \
It will skip the JSON package detection routines and will die loudly that \
it couldn't find a package."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.420.0"

RPM_NAME = "perl-JSON-Any-1.420.0-1.2.noarch.rpm"
RPM_HASH = "57230dbf89ab2ee9d96fb3bf831a99ab4441713c590f97e99143993e49c1234066b73e658c0ad22c3cfac06f350aee144f484a5e263dd6e2280a84085c37f1e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--Any \
perl-JSON-Any"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
