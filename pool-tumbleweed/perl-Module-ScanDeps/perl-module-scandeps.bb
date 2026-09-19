SUMMARY = "Recursively scan Perl code for dependencies"
DESCRIPTION = "This module scans potential modules used by perl programs, and returns a \
hash reference; its keys are the module names as appears in '%INC' (e.g. \
'Test/More.pm'); the values are hash references with this structure: \
 \
    { \
        file    => '/usr/local/lib/perl5/5.8.0/Test/More.pm', \
        key     => 'Test/More.pm', \
        type    => 'module',    # or 'autoload', 'data', 'shared' \
        used_by => [ 'Test/Simple.pm', ... ], \
        uses    => [ 'Test/Other.pm', ... ], \
    } \
 \
One function, 'scan_deps', is exported by default. Other functions such as \
('scan_line', 'scan_chunk', 'add_deps', 'path_to_inc_name') are exported \
upon request. \
 \
Users of *App::Packer* may also use this module as the dependency-checking \
frontend, by tweaking their _p2e.pl_ like below: \
 \
    use Module::ScanDeps; \
    ... \
    my $packer = App::Packer->new( frontend => 'Module::ScanDeps' ); \
    ... \
 \
Please see App::Packer::Frontend for detailed explanation on the structure \
returned by 'get_files'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.370.0"

RPM_NAME = "perl-Module-ScanDeps-1.370.0-1.11.aarch64.rpm"
RPM_HASH = "1639c8f7c20b151e5ea988ed7dc9dd40231f7b48107e7655897dcc232ba066ce4c6809878f7d1cd36ae06e3b782fd3b2f9cde28811969385d2bba9504c1e778c"

RPROVIDES:${PN} += "perl-Module--ScanDeps \
perl-Module--ScanDeps--Cache \
perl-Module-ScanDeps"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-List--Util \
perl-Module--Metadata \
perl-version"

inherit rpm
