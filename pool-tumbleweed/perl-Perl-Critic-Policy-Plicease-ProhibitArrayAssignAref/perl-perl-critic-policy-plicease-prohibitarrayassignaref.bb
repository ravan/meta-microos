SUMMARY = "Don't assign an anonymous arrayref to an array"
DESCRIPTION = "This policy is a fork of \
Perl::Critic::Policy::ValuesAndExpressions::ProhibitArrayAssignAref. It \
differs from the original by not having a dependency on List::MoreUtils. It \
is unfortunately still licensed as GPL3. \
 \
It asks you not to assign an anonymous arrayref to an array \
 \
    @array = [ 1, 2, 3 ];       # bad \
 \
The idea is that it's rather unclear whether an arrayref is intended, or \
might have meant to be a list like \
 \
    @array = ( 1, 2, 3 ); \
 \
This policy is under the 'bugs' theme (see Perl::Critic/POLICY THEMES) for \
the chance '[]' is a mistake, and since even if it's correct it will likely \
make anyone reading it wonder. \
 \
A single arrayref can still be assigned to an array, but with parens to \
make it clear, \
 \
    @array = ( [1,2,3] );       # ok \
 \
Dereferences or array and hash slices (see perldata/Slices) are recognised \
as an array target and treated similarly, \
 \
    @$ref = [1,2,3];            # bad assign to deref \
    @{$ref} = [1,2,3];          # bad assign to deref \
    @x[1,2,3] = ['a','b','c'];  # bad assign to array slice \
    @x{'a','b'} = [1,2];        # bad assign to hash slice"
LICENSE = "GPL-1.0-or-later"

PV = "100.0.0"

RPM_NAME = "perl-Perl-Critic-Policy-Plicease-ProhibitArrayAssignAref-100.0.0-1.10.noarch.rpm"
RPM_HASH = "8249c3c8290777aecbdd69354623c76e285c5356185163fdb8381d510f0cf9846d513029c7e276ece45d41e47558a0769ac0780c24e1a8df6f16017e172dd6b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Critic--Policy--Plicease--ProhibitArrayAssignAref \
perl-Perl-Critic-Policy-Plicease-ProhibitArrayAssignAref"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Perl--Critic--Policy \
perl-Perl--Critic--Utils"

inherit rpm
