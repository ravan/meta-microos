SUMMARY = "Check for pod coverage in your distribution"
DESCRIPTION = "Test::Pod::Coverage is used to create a test for your distribution, to \
ensure that all relevant files in your distribution are appropriately \
documented in pod. \
 \
Can also be called with Pod::Coverage parms. \
 \
    use Test::Pod::Coverage tests=>1; \
    pod_coverage_ok( \
        'Foo::Bar', \
        { also_private => [ qr/^[A-Z_]+$/ ], }, \
        'Foo::Bar, with all-caps functions as privates', \
    ); \
 \
The Pod::Coverage parms are also useful for subclasses that don't \
re-document the parent class's methods. Here's an example from Mail::SRS. \
 \
    pod_coverage_ok( 'Mail::SRS' ); # No exceptions \
 \
     \
    my $trustme = { trustme => [qr/^(new|parse|compile)$/] }; \
    pod_coverage_ok( 'Mail::SRS::DB', $trustme ); \
    pod_coverage_ok( 'Mail::SRS::Guarded', $trustme ); \
    pod_coverage_ok( 'Mail::SRS::Reversable', $trustme ); \
    pod_coverage_ok( 'Mail::SRS::Shortcut', $trustme ); \
 \
Alternately, you could use Pod::Coverage::CountParents, which always allows \
a subclass to reimplement its parents' methods without redocumenting them. \
For example: \
 \
    my $trustparents = { coverage_class => 'Pod::Coverage::CountParents' }; \
    pod_coverage_ok( 'IO::Handle::Frayed', $trustparents ); \
 \
(The 'coverage_class' parameter is not passed to the coverage class with \
other parameters.) \
 \
If you want POD coverage for your module, but don't want to make \
Test::Pod::Coverage a prerequisite for installing, create the following as \
your _t/pod-coverage.t_ file: \
 \
    use Test::More; \
    eval 'use Test::Pod::Coverage'; \
    plan skip_all => 'Test::Pod::Coverage required for testing pod coverage' if $@; \
 \
    plan tests => 1; \
    pod_coverage_ok( 'Pod::Master::Html'); \
 \
Finally, Module authors can include the following in a _t/pod-coverage.t_ \
file and have 'Test::Pod::Coverage' automatically find and check all \
modules in the module distribution: \
 \
    use Test::More; \
    eval 'use Test::Pod::Coverage 1.00'; \
    plan skip_all => 'Test::Pod::Coverage 1.00 required for testing POD coverage' if $@; \
    all_pod_coverage_ok();"
LICENSE = "Artistic-2.0"

PV = "1.100.0"

RPM_NAME = "perl-Test-Pod-Coverage-1.100.0-1.3.noarch.rpm"
RPM_HASH = "a6c9a056d3bc5234c48afa6978cdfd35c9327fc5ea1dc2db7a57ad44c24c3da60180d375569f6662cddd6be1bc96ea727660196512303d29565a626d6e5b0080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Pod--Coverage \
perl-Test-Pod-Coverage"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Pod--Coverage"

inherit rpm
