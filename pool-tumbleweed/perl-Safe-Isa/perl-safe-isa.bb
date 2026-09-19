SUMMARY = "Call isa, can, does and DOES safely on things that may not be objects"
DESCRIPTION = "How many times have you found yourself writing: \
 \
  if ($obj->isa('Something')) { \
 \
and then shortly afterwards cursing and changing it to: \
 \
  if (Scalar::Util::blessed($obj) and $obj->isa('Something')) { \
 \
Right. That's why this module exists. \
 \
Since perl allows us to provide a subroutine reference or a method name to \
the -> operator when used as a method call, and a subroutine doesn't \
require the invocant to actually be an object, we can create safe versions \
of isa, can and friends by using a subroutine reference that only tries to \
call the method if it's used on an object. So: \
 \
  my $isa_Foo = $maybe_an_object->$_call_if_object(isa => 'Foo'); \
 \
is equivalent to \
 \
  my $isa_Foo = do { \
    if (Scalar::Util::blessed($maybe_an_object)) { \
      $maybe_an_object->isa('Foo'); \
    } else { \
      undef; \
    } \
  }; \
 \
Note that we don't handle trying class names, because many things are valid \
class names that you might not want to treat as one (like say 'Matt') - the \
'is_module_name' function from Module::Runtime is a good way to check for \
something you might be able to call methods on if you want to do that. \
 \
We are careful to make sure that scalar/list context is preserved for the \
method that is eventually called."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.000010"

RPM_NAME = "perl-Safe-Isa-1.000010-1.33.noarch.rpm"
RPM_HASH = "82de082e3a8bc6c97eb05949a0db14dc7d3fca32c4cf30e8bae2d11fa2037bf5ea47a27b6d9c252da26d6a3b8f9aa2d445684055d3d54bb94a829072d29b722d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Safe--Isa \
perl-Safe-Isa"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
