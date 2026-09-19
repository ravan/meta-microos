SUMMARY = "Don't write loops on hashes, only on keys and values of hashes"
DESCRIPTION = "When 'looping over hashes,' we mean looping over hash keys or hash values. \
If you forgot to call 'keys' or 'values' you will accidentally loop over \
both. \
 \
    foreach my $foo (%hash) {...}        # not ok \
    action() for %hash;                  # not ok \
    foreach my $foo ( keys %hash ) {...} # ok \
    action() for values %hash;           # ok \
 \
An effort is made to detect expressions: \
 \
    action() for %hash ? keys %hash : ();                             # ok \
    action() for %{ $hash{'stuff'} } ? keys %{ $hash{'stuff'} } : (); # ok \
 \
(Granted, the second example there doesn't make much sense, but I have \
found a variation of it in real code.)"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "perl-Perl-Critic-Policy-Variables-ProhibitLoopOnHash-0.9.0-1.5.noarch.rpm"
RPM_HASH = "f3fd86e818d46beefdaed0343ac05d0f09883c48c4d238b4bae3b519e24268fc317eb61b405e371132076672e55dfd106f05e652b0284ad065b99583eb1c53ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Critic--Policy--Variables--ProhibitLoopOnHash \
perl-Perl-Critic-Policy-Variables-ProhibitLoopOnHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--Util \
perl-Perl--Critic \
perl-parent"

inherit rpm
