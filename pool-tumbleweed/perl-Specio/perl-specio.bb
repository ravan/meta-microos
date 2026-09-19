SUMMARY = "Type constraints and coercions for Perl"
DESCRIPTION = "The 'Specio' distribution provides classes for representing type \
constraints and coercion, along with syntax sugar for declaring them. \
 \
Note that this is not a proper type system for Perl. Nothing in this \
distribution will magically make the Perl interpreter start checking a \
value's type on assignment to a variable. In fact, there's no built-in way \
to apply a type to a variable at all. \
 \
Instead, you can explicitly check a value against a type, and optionally \
coerce values to that type."
LICENSE = "Artistic-2.0"

PV = "0.530.0"

RPM_NAME = "perl-Specio-0.530.0-1.5.noarch.rpm"
RPM_HASH = "ae8c1837f58785d2cdb14667a0a65313121af5aac21865a8633be94f7e6b148242e35ccbffa93c8eefc7973d9943f78b9a1b9b58b6c697153cd6e715c7b46692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Specio \
perl-Specio--Coercion \
perl-Specio--Constraint--AnyCan \
perl-Specio--Constraint--AnyDoes \
perl-Specio--Constraint--AnyIsa \
perl-Specio--Constraint--Enum \
perl-Specio--Constraint--Intersection \
perl-Specio--Constraint--ObjectCan \
perl-Specio--Constraint--ObjectDoes \
perl-Specio--Constraint--ObjectIsa \
perl-Specio--Constraint--Parameterizable \
perl-Specio--Constraint--Parameterized \
perl-Specio--Constraint--Role--CanType \
perl-Specio--Constraint--Role--DoesType \
perl-Specio--Constraint--Role--Interface \
perl-Specio--Constraint--Role--IsaType \
perl-Specio--Constraint--Simple \
perl-Specio--Constraint--Structurable \
perl-Specio--Constraint--Structured \
perl-Specio--Constraint--Union \
perl-Specio--Declare \
perl-Specio--DeclaredAt \
perl-Specio--Exception \
perl-Specio--Exporter \
perl-Specio--Helpers \
perl-Specio--Library--Builtins \
perl-Specio--Library--Numeric \
perl-Specio--Library--Perl \
perl-Specio--Library--String \
perl-Specio--Library--Structured \
perl-Specio--Library--Structured--Dict \
perl-Specio--Library--Structured--Map \
perl-Specio--Library--Structured--Tuple \
perl-Specio--OO \
perl-Specio--PP \
perl-Specio--PartialDump \
perl-Specio--Registry \
perl-Specio--Role--Inlinable \
perl-Specio--Subs \
perl-Specio--TypeChecks \
perl-Specio--XS \
perl-Test--Specio"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Clone \
perl-Clone--PP \
perl-Devel--StackTrace \
perl-Eval--Closure \
perl-List--Util \
perl-MRO--Compat \
perl-Module--Implementation \
perl-Module--Runtime \
perl-Role--Tiny \
perl-Role--Tiny--With \
perl-Sub--Quote \
perl-Test--Fatal \
perl-Test--More \
perl-Try--Tiny \
perl-XString \
perl-parent \
perl-version"

inherit rpm
