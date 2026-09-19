SUMMARY = "Meatier versions of caller"
DESCRIPTION = "* caller_cv($level) \
 \
'caller_cv' gives you the coderef of the subroutine being invoked at the \
call frame indicated by the value of $level \
 \
* caller_args($level) \
 \
Returns the arguments passed into the caller at level $level \
 \
* caller_vars( $level, $names ) \
  =item called_with($level, $names) \
 \
'called_with' returns a list of references to the original arguments to the \
subroutine at $level. if $names is true, the names of the variables will be \
returned instead \
 \
constants are returned as 'undef' in both cases \
 \
* called_as_method($level) \
 \
'called_as_method' returns true if the subroutine at $level was called as a \
method."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.70.0"

RPM_NAME = "perl-Devel-Caller-2.70.0-1.8.aarch64.rpm"
RPM_HASH = "9405225ead8175c07a93aa42515e6d8ef696e270ed5caa6f6748b42ebdabf49f72c7d8d29f918bda313140c86d394c67ef1817c799f188edd6047be5aaff614b"

RPROVIDES:${PN} += "perl-Devel--Caller \
perl-Devel-Caller"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-PadWalker"

inherit rpm
