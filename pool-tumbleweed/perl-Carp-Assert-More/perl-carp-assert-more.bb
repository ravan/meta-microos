SUMMARY = "Convenience assertions for common situations"
DESCRIPTION = "Carp::Assert::More is a convenient set of assertions to make the habit of \
writing assertions even easier. \
 \
Everything in here is effectively syntactic sugar. There's no technical \
difference between calling one of these functions: \
 \
    assert_datetime( $foo ); \
    assert_isa( $foo, 'DateTime' ); \
 \
that are provided by Carp::Assert::More and calling these assertions from \
Carp::Assert \
 \
    assert( defined $foo ); \
    assert( ref($foo) eq 'DateTime' ); \
 \
My intent here is to make common assertions easy so that we as programmers \
have no excuse to not use them."
LICENSE = "Artistic-2.0"

PV = "2.9.0"

RPM_NAME = "perl-Carp-Assert-More-2.9.0-1.8.noarch.rpm"
RPM_HASH = "91a01c42d4f9c75d725bf2aa2c3f6ea787fb501f147e668e772d14c8368bec938621c62f259485f69ca5d50844ba4a1f5a5d8f3db4ffe44141ccbe27990b1d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Carp--Assert--More \
perl-Carp-Assert-More"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
