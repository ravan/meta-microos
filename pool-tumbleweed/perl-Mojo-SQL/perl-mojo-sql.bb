SUMMARY = "Safely generate and compose SQL statements"
DESCRIPTION = "Mojo::SQL safely generates and composes SQL statements. To prevent SQL \
injection attacks, every '?' in the input becomes a placeholder in the \
generated query, with the corresponding value bound to it. Partial \
statements can be composed recursively to build more complex queries. \
 \
Literal question marks can be escaped with '??'. \
 \
  use Mojo::SQL qw(sql); \
 \
  my $role    = 'admin'; \
  my $partial = sql('AND role = ?', $role); \
  my $name    = 'root'; \
 \
   \
  my $query = sql('SELECT * FROM users WHERE name = ? ?', $name, $partial)->to_query; \
 \
Make partial statements optional to dynamically generate 'WHERE' clauses. \
 \
  my $optional = $foo ? sql('AND foo IS NOT NULL') : sql(''); \
  my $query    = sql('SELECT * FROM users WHERE name = ? ?', 'sebastian', $optional)->to_query; \
 \
If you need a little more control over the generated SQL query, you can \
also bypass safety features with 'sql_unsafe'. But make sure to handle \
unsafe values yourself with appropriate escaping functions for your \
database. For PostgreSQL there are 'escape_literal' and 'escape_identifier' \
functions included with this module. \
 \
  use Mojo::SQL qw(sql sql_unsafe escape_literal); \
 \
  my $role    = 'role = ' . escape_literal('power user'); \
  my $partial = sql_unsafe 'AND ?', $role; \
  my $name    = 'root'; \
 \
   \
  my $query = sql('SELECT * FROM users WHERE name = ? ?', $name, $partial)->to_query; \
 \
For databases that do not support numbered placeholders like '$1' and '$2', \
you can set a custom character with the 'placeholder' option. \
 \
   \
  my $query = sql('SELECT * FROM users WHERE name = ?', 'root')->to_query({placeholder => '?'});"
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "perl-Mojo-SQL-0.20.0-1.3.noarch.rpm"
RPM_HASH = "15b881813deacd10b7f9ac3fb21619ab6926db80ae67544ad32b1e2d3ff43db676c5df1b5ab19b2d4dfa107b8d6d85c40be2ba16365a96e604f527732b942ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--SQL \
perl-Mojo--SQL--Statement \
perl-Mojo-SQL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mojolicious"

inherit rpm
