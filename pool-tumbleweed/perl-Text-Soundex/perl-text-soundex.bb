SUMMARY = "Implementation of the soundex algorithm"
DESCRIPTION = "Soundex is a phonetic algorithm for indexing names by sound, as pronounced \
in English. The goal is for names with the same pronunciation to be encoded \
to the same representation so that they can be matched despite minor \
differences in spelling. Soundex is the most widely known of all phonetic \
algorithms and is often used (incorrectly) as a synonym for 'phonetic \
algorithm'. Improvements to Soundex are the basis for many modern phonetic \
algorithms. (Wikipedia, 2007) \
 \
This module implements the original soundex algorithm developed by Robert \
Russell and Margaret Odell, patented in 1918 and 1922, as well as a \
variation called 'American Soundex' used for US census data, and current \
maintained by the National Archives and Records Administration (NARA). \
 \
The soundex algorithm may be recognized from Donald Knuth's *The Art of \
Computer Programming*. The algorithm described by Knuth is the NARA \
algorithm. \
 \
The value returned for strings which have no soundex encoding is defined \
using '$Text::Soundex::nocode'. The default value is 'undef', however \
values such as ''Z000'' are commonly used alternatives. \
 \
For backward compatibility with older versions of this module the \
'$Text::Soundex::nocode' is exported into the caller's namespace as \
'$soundex_nocode'. \
 \
In scalar context, 'soundex()' returns the soundex code of its first \
argument. In list context, a list is returned in which each element is the \
soundex code for the corresponding argument passed to 'soundex()'. For \
example, the following code assigns @codes the value '('M200', 'S320')': \
 \
   @codes = soundex qw(Mike Stok); \
 \
To use 'Text::Soundex' to generate codes that can be used to search one of \
the publically available US Censuses, a variant of the soundex algorithm \
must be used: \
 \
    use Text::Soundex; \
    $code = soundex_nara($name); \
 \
An example of where these algorithm differ follows: \
 \
    use Text::Soundex; \
    print soundex('Ashcraft'), '\\n';       # prints: A226 \
    print soundex_nara('Ashcraft'), '\\n';  # prints: A261"
LICENSE = "HPND"

PV = "3.50.0"

RPM_NAME = "perl-Text-Soundex-3.50.0-1.8.aarch64.rpm"
RPM_HASH = "da20d80ee8a613ed56b9cd8a68e8ee6e26b1d61850e4258c858756ae48cfa2eb8f128396427ce88ddd6d0967492b72a0d3bfebd93b5e09aefa1d940a7c6f326f"

RPROVIDES:${PN} += "perl-Text--Soundex \
perl-Text-Soundex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
